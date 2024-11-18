import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> arr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int random = (int)(Math.random() * 11);
      if (random == 0){
        arr.add("");
      }else{
        arr.add(random + "");
      }
    }
    return arr;
  }

  public static void replaceEmpty(ArrayList<String> original){
    while (original.indexOf("") != -1) {
      original.set(original.indexOf(""), "Empty");
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> reversed = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--){
      reversed.add(original.get(i));
    }
    return reversed;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> mixed = new ArrayList<String>(a.size() + b.size());
    ArrayList<String> shorter = a;
    ArrayList<String> longer = b;
    if (a.size() > b.size()) {
      shorter = b;
      longer = a;
    }
    for (int i = 0; i < shorter.size(); i++) {
      mixed.add(a.get(i));
      mixed.add(b.get(i));
    }
    for (int i = shorter.size(); i < longer.size(); i++) {
      mixed.add(longer.get(i));
    }
    return mixed;
  }

  public static void main(String[] args){
    //createRandomArray, replaceEmpty, and makeReversedList test cases
    ArrayList<String> arr1 = createRandomArray(15);
    System.out.println(arr1);
    replaceEmpty(arr1);
    System.out.println(arr1);
    System.out.println(makeReversedList(arr1));
    ArrayList<String> arr2 = createRandomArray(5);
    System.out.println(arr2);
    System.out.println(makeReversedList(arr2));

    //mixLists test cases
    ArrayList<String> arr3a = createRandomArray(6);
    ArrayList<String> arr3b = createRandomArray(10);
    replaceEmpty(arr3a);
    replaceEmpty(arr3b);
    System.out.println(arr3a);
    System.out.println(arr3b);
    System.out.println(mixLists(arr3a, arr3b));
    ArrayList<String> arr4a = createRandomArray(7);
    ArrayList<String> arr4b = createRandomArray(3);
    replaceEmpty(arr4a);
    replaceEmpty(arr4b);
    System.out.println(arr4a);
    System.out.println(arr4b);
    System.out.println(mixLists(arr4a, arr4b));
    ArrayList<String> arr5a = createRandomArray(6);
    ArrayList<String> arr5b = createRandomArray(6);
    replaceEmpty(arr5a);
    replaceEmpty(arr5b);
    System.out.println(arr5a);
    System.out.println(arr5b);
    System.out.println(mixLists(arr5a, arr5b));
    // System.out.println(createRandomArray(10));
    // System.out.println(createRandomArray(200001));
  }
}