package edu.uog.item;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

public class ItemData {

//    ShowItems showItems = new ShowItems();


    //    public List<Item> ShowAll(){
//        List<Item> items = new ArrayList<Item>();
//        String line;
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(Item.csvFile));
//
//            while ((line = bufferedReader.readLine()) !=null){
//                Item item = new Item();
//                String[] itemRow = line.split(",");
//                item.setITEM_ID(Integer.parseInt(itemRow[0]));
//                item.setITEM_NAME(itemRow[1]);
//                item.setITEM_DESC(itemRow[2]);
//                item.setITEM_PRICE(Integer.parseInt(itemRow[3]));
//                item.setITEM_QTY(Integer.parseInt(itemRow[4]));
//                item.setITEM_SIZE(itemRow[5]);
//
//                items.add(item);
//
//            }
//        } catch (IOException e) {
//            System.out.println("errrror");
//            e.printStackTrace();
//        }
//
//        return items;
//    }

//    @SuppressWarnings({"resource", "resource"})
//    public Item findOne(int item_ID){
//        String line;
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(Item.csvFile));
//
//            while ((line = bufferedReader.readLine()) !=null){
//                Item item = new Item();
//                String[] itemRow = line.split(",");
//
//                if(Integer.parseInt(itemRow[0])==item_ID) {
//
//                    item.setITEM_ID(Integer.parseInt(itemRow[0]));
//                    item.setITEM_NAME(itemRow[1]);
//                    item.setITEM_DESC(itemRow[2]);
//                    item.setITEM_PRICE(Integer.parseInt(itemRow[3]));
//                    item.setITEM_QTY(Integer.parseInt(itemRow[4]));
//                    item.setITEM_SIZE(itemRow[5]);
//                      return item;
//                }
//
//            }
//        } catch (IOException e) {
//            System.out.println("errrror");
//            e.printStackTrace();
//        }
//
//        return null;
//    }

//    @SuppressWarnings("resource")
//    public List<Item> search(String search){
//        List<Item> items = new ArrayList<Item>();
//        String line;
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(Item.csvFile));
//
//            while ((line = bufferedReader.readLine()) !=null){
//                Item item = new Item();
//                String[] itemRow = line.split(",");
//
//                if(itemRow[1].contains(search)==true) {
//
//                    item.setITEM_ID(Integer.parseInt(itemRow[0]));
//                    item.setITEM_NAME(itemRow[1]);
//                    item.setITEM_DESC(itemRow[2]);
//                    item.setITEM_PRICE(Integer.parseInt(itemRow[3]));
//                    item.setITEM_QTY(Integer.parseInt(itemRow[4]));
//                    item.setITEM_SIZE(itemRow[5]);
//
//
//                    items.add(item);
//                }
//
//            }
//        } catch (IOException e) {
//            System.out.println("errrror");
//            e.printStackTrace();
//        }
//
//        return items;
//    }

//    @SuppressWarnings("resource")
//    public Item Save (Item item){
//        String line;
//
//        FileWriter fileWriter;
//        List<Item> items = showItems.ShowAll();
//
//        try {
//            fileWriter = new FileWriter(Item.csvFile);
//
//            for (int i=0; i<items.size(); i++) {
//                fileWriter.append(items.get(i).toString());
//                fileWriter.append("\n");}
//
//            if (items.size()>0) {
//                item.setITEM_ID(items.get(items.size()-1).getITEM_ID()+1);
//            }
//            else
//                item.setITEM_ID(1);
//            fileWriter.append(item.toString());
//            fileWriter.append("\n");
//            fileWriter.flush();
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }
//
//
//        return item;
//    }

}
