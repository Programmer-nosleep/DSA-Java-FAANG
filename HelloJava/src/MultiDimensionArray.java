public class MultiDimensionArray {
    public int[][] arr = null;

    public MultiDimensionArray(int numOfRows, int numOfCols) {
        this.arr = new int[numOfRows][numOfCols];
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // inserting value of array
    public void insertValueInTheArray(int row, int col, int val) {
        try {
           if (arr[row][col] == Integer.MIN_VALUE) {
               arr[row][col] = val;
               System.out.println("The value is successfully inserted");
           }
           System.out.println("This cell is already occupied");
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid index for 2D array" + e);
        }
    }

    public void accessCell(int row, int col) {
        System.out.printf("\n\nAccessing Row# %d, %d Col#\n", row, col);
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                System.out.println("Cell is empty");
            } else {
                System.out.printf("%d", arr[row][col]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array");
        }
    }

    // traverse 2D array
    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == Integer.MIN_VALUE) {
                    System.out.print("0");
                } else {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    //searching a single value from the Array
    public void searching(int value) {
       for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[0].length; col++) {
               if (arr[row][col] == value) {
                  if (arr[row][col] == Integer.MIN_VALUE) {
                    System.out.print("0");
                  } else {
                      System.out.printf("value is found at row : %d col : %d", row, col);
                  }
               }
           }
           System.out.println();
       }
//       System.out.println("value is not found");
    }

    // deleting a value from array
    public void deleteValue(int row, int col) {
       try {
          System.out.println("Successfully deleted : " + arr[row][col]);
          arr[row][col] = Integer.MIN_VALUE;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("This index is not valid for array");
       }
    }
}
