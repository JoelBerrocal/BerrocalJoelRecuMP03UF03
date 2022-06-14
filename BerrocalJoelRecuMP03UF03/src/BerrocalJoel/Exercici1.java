package BerrocalJoel;

import java.io.File;
import java.util.Scanner;

class Exercici1 {
  public static void main(String[] args) {

    int count = 0;

    try {
      File file = new File("prova.txt");

      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("Numero total de linies: " + count);

      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}