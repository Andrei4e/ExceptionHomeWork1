import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        int a = Division(10, 0);
        FileNotFound();
        NullPointer();
        int[] arr1 = new int[] {9,8,7,6,5};
        int[] arr2 = new int[] {5,4,3,2};
        int[] arr3 = Arrays(arr1, arr2);
    }

    public static int Division(int num1, int num2) {
        int result = 0;
        try {
            result = num1/num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return result;
    }

    public static void FileNotFound() {		
        File f = new File("test");
        FileReader fr;
        try {
            fr = new FileReader(f);
            System.out.println(fr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }

    public static void NullPointer() {		
        String str=null;
        try {
            System.out.println("Length :"+str.length()); 
        } catch (Exception e) {
            System.out.println("Отсутствует ссылка на объект");
        }        
    }

    public static int[] Arrays(int[] array1, int[] array2) throws Exception {
        if (array1.length != array2.length) {
            throw new Exception("Массивы разной длинны");
        }
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i] - array2[i];
        }  
        return array3;  
    }
 
}

