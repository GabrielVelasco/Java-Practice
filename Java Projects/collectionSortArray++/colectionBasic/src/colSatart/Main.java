package colSatart;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class Main {
    public static void sortComparableInterfacePrac(){
        Team[] arr = new Team[5];

        arr[0] = new Team("SC Palmerda");
        arr[1] = new Team("Clube Atletico Mineiro");
        arr[2] = new Team("Red Bull Bragabosta");
        arr[3] = new Team("Clube Rebosta Flabosta");
        arr[4] = new Team("SC Cortinas");

        Arrays.sort(arr);

        for(Team t: arr){
            System.out.println(t.getFullName());
        }
    }

    public static boolean searchByCpf(ArrayList<Employee> arr, String cpfQuerry){
        for(Employee e: arr){
            if(e.getCpf().equals(cpfQuerry))
                return true;
        }

        return false;
    }

    public static void sortComparableEmployeeArrayList(){
        // using arraylist
        ArrayList<Employee> arr = new ArrayList<Employee>();

        arr.add(new Employee(30, "123", 300));
        arr.add(new Employee(40, "123", 400));
        arr.add(new Employee(20, "123", 200));

        if (searchByCpf(arr, "123"))
            System.out.println("SIM");
        else
            System.out.println("NO");

        // sort according to Employee.compareTo() using Collections class
        Collections.sort(arr);

        for(Employee e: arr){
            e.printInfos(); // infos about this one employee
        }
    }

    public static void hashMapEmployee(){
        HashMap<String, Employee> hashMapEmployee = new HashMap<String, Employee>();

        hashMapEmployee.put("123", new Employee(30, "123", 300));
        hashMapEmployee.put("456", new Employee(40, "456", 400));
        hashMapEmployee.put("789", new Employee(20, "789", 200));
        hashMapEmployee.put("14095835621", new Employee(24, "14095835621", 2500));

        // qry by CPF number
        String cpfQuery = "14095835621";
        hashMapEmployee.get(cpfQuery).printInfos();

        // cpf of employee biggest/smallest salary
        Employee biggestSal = null, smallestSal = null;
        boolean firstRun = true;
        for(String key: hashMapEmployee.keySet()){
            if(firstRun){
                biggestSal = smallestSal = hashMapEmployee.get(key);
                firstRun = false;

            }else {
                if(hashMapEmployee.get(key).getSalary() > biggestSal.getSalary()){
                    biggestSal = hashMapEmployee.get(key);

                }else if (hashMapEmployee.get(key).getSalary() < smallestSal.getSalary()){
                    smallestSal = hashMapEmployee.get(key);
                }
            }
        }

        System.out.println("=========================");
        biggestSal.printInfos();
        smallestSal.printInfos();
    }

    public static int generateRandomNumber(int to){
        Random rand = new Random();
        return rand.nextInt(to);
    }

    public static void matrixArrayList(){
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();

        // instantiate matrix example
        boolean tmp = false;
        int lines = 5, col = 5;
        if(tmp) {
            for (int i = 0; i < lines; i++) {
                mat.add(new ArrayList<Integer>()); // allocate line

                for (int j = 0; j < col; j++)
                    mat.get(i).add(1);

                System.out.println(mat.get(i));
            }
        }

        /////////////////////////////////////////////////////////////////////////////
        ArrayList<ArrayList<Integer>> bigMat = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, Integer> freqCounter = new HashMap<Integer, Integer>();

        lines = col = 10;
        for(int i = 0; i < lines; i++){
            bigMat.add(new ArrayList<Integer>()); // allocate line

            for(int j = 0; j < col; j++) { // instantiate line
                int randNumb = generateRandomNumber(256);
                if(freqCounter.containsKey(randNumb)) {
                    int newValue = freqCounter.get(randNumb); newValue += 1;
                    freqCounter.replace(randNumb, newValue);

                }else{
                    freqCounter.put(randNumb, 1);
                }

                bigMat.get(i).add(randNumb);
            }

            System.out.println(bigMat.get(i));
        }

        System.out.println(freqCounter);
    }

    public static void main(String[] args){
        matrixArrayList();
    }
}
