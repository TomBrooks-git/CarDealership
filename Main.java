import java.io.*;
import java.util.*;
import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Tom\\IdeaProjects\\CarDealership\\src\\newCars.csv";


        BufferedReader reader = null;
        String buffer = "";
        Scanner sc = null;

        ArrayList<Vehicle> vics = new ArrayList<Vehicle>();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while((buffer = reader.readLine()) != null)
            {
                String[] row = buffer.split(",");

                int tMileage = Integer.parseInt(row[0]);
                String tMake = row[1];
                String tModel = row[2];
                int tPrice = Integer.parseInt(row[3]);
                int tYear = Integer.parseInt(row[4]);
                int tVin = Integer.parseInt(row[5]);

                Vehicle temp = new Vehicle(tMileage, tMake, tModel, tPrice, tYear, tVin);
                vics.add(temp);

            }

        }
        catch(Exception e){
            System.out.println("Error encountered");
            e.printStackTrace();
        }
        finally{
            reader.close();
        }

        //showNewVics(vics);
        sortVicsByVin(vics);
        showNewVics(vics);

        findByVin(vics, 6).showVic();



    }

    public static void showNewVics(ArrayList<Vehicle> vics)
    {
        Calendar c = Calendar.getInstance();
        System.out.println("New vehicles for " + c.getTime() + "\n");
        for(int i = 0; i < vics.size(); i++)
        {
            vics.get(i).showVic();
            System.out.printf("\n\n");
        }

    }

    public static void sortVicsByVin(ArrayList<Vehicle> list)
    {
        int tempMin = 0;
        for(int i = 0; i < list.size(); i++)
        {
            tempMin = i;
            for(int j = i; j < list.size(); j++)
            {
                if(list.get(j).getVin() < list.get(tempMin).getVin())
                {
                    tempMin = j;
                }
            }
            swap(list, i, tempMin);
        }
    }

    public static Vehicle findByVin(ArrayList<Vehicle> list, int tgtVin)
    {

        int l = 0, r = list.size() - 1;

        while(l <= r)
        {
            int mid = l + ((r - l)/2);

            if(list.get(mid).getVin() == tgtVin)
            {
                System.out.println("Vehicle found");
                return list.get(mid);
            }

            if(list.get(mid).getVin() < tgtVin)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return null;
    }



}