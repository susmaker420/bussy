/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bussy.bokning;

import java.util.Scanner;

public class BussyBokning {

    static boolean[] uptagen = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    static boolean meny = true;
    int[] platser = new int[20];
    int selp;
    int pnummer;
    double pengar = 299;
    double rabbatP = 0.80;
    static Scanner scan = new Scanner(System.in);
    int svara;
    static int val;
    int dag;
    
    static int mån = 0;
    static bussy.bokning.BussyBokning B = new bussy.bokning.BussyBokning();

    public static void main(String[] args) {

        while (meny) {
            System.out.println("AirBuss");
            System.out.println("1. Boka plats");
            System.out.println("2. Info om resan");
            System.out.println("3. Avsluta");
            System.out.println("4 avboka");
            System.out.print("Ange val:");
            val = scan.nextInt();

            switch (val) {
                case 2:
                    System.out.println("denna buss åker ifrån stockholm till göteborg den åker 2 gånger om dagen");
                    break;
                case 3:
                    meny = false;
                    break;
                case 1:
                    B.case1();
                    break;
                case 4:
                    B.case4();
            }

        }
    }

    void case1() {

        System.out.println("skriv in ditt år i personnummer");
        int år = scan.nextInt();
        scan.nextLine();
        if (år >= 2000 && år <= 2008) {
            System.out.println("du har tilgång till en rabbat vill du använda den?");
            System.out.println("1 för ja 2 för nej");

            svara = scan.nextInt();
            while (svara != 1 && svara != 2) {

                System.out.println("du har tilgång till en rabbat vill du använda den?");
                System.out.println("1 för ja 2 för nej");
                svara = scan.nextInt();
                System.out.println("du skrev inte 1 eller 2.");
            }
            scan.nextLine();
        }
        if (svara == 1) {
            pengar = (pengar * rabbatP);
        } else if (svara == 2) {
            pengar = pengar * 1;
        }
        System.out.println("skriv in månaden");
        mån = scan.nextInt();
        while (mån > 12 || mån <= 0) {
            System.out.println("du skrev in fel månad försök igen skriv igen.");
            mån = scan.nextInt();
        }
        scan.nextLine();

        System.out.println("skriv in dag");
        dag = scan.nextInt();
        while (dag > 31 || dag <= 0) {
            System.out.println("du skrev in fel dag försök igen skriv igen.");
            dag = scan.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (platser[i] == 0) {
                selp = i;
                System.out.println("Vi har hittat en plats! Vill du ta den? din plats är " + i + " 1 för ja 2 för nej.");
                val = scan.nextInt();
                if (val == 1) {
                    uptagen[i] = true;
                    System.out.print(" det kommer kosta dig " + pengar + " kr ");
                    int yyyy = år * 10000;
                    int mm = mån * 100;
                    int dd = dag;
                    int pnummer = (yyyy + mm + dd);
                    platser[selp] = pnummer;

                    break;

                }
            }

        }
        }
void case4(){
    System.out.println("skrivin ditt personnummer då ditt år du är föd åååå och sen månaden mm och sen dagen dd");
    int newperson = scan.nextInt();
       scan.nextLine();
       if(newperson == pnummer){
           System.out.println("vill du avboka 1 för ja och 2 för nej");
           int val2 = scan.nextInt();
           if(val2 == 1){
               selp = 0;
           }else if(val2 == 2){
               
           }
         
              
           
       }
       
}
}
