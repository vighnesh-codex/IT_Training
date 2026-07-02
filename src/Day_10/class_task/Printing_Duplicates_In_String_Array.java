package Day_10.class_task;

public class Printing_Duplicates_In_String_Array {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "grape", "banana"};
        String[] duplicates = new String[arr.length];
        int dupIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < dupIndex; k++) {
                        if (duplicates[k].equals(arr[i])) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        duplicates[dupIndex++] = arr[i];
                    }
                }
            }
        }

        System.out.print("Duplicate strings in the array: ");
        for (int i = 0; i < dupIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}
