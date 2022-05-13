package Bai16_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numberList = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null) {
                numberList.add(Integer.parseInt(line));
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return numberList;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Max value is: "+max);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int findMax (List<Integer> numbers){
        int max = numbers.get(0);
        for (int i=0; i<numbers.size(); i++){
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbersList =  readAndWriteFile.readFile("/Users/macbookair/Desktop/Codegym/Module2/numbers.txt");
        int maxValue = findMax(numbersList);
        readAndWriteFile.writeFile("/Users/macbookair/Desktop/Codegym/Module2/numbers.txt", maxValue);
    }

}
