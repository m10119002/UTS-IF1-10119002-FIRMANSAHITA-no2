/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uts.no2;

import java.util.Scanner;
import m10119002.pbo.uts.no2.target.Tabungan;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi : UTS No-2
 * 
 */
public class Program {
    private static String getInput(Scanner scan) {
        return scan.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a,b,c;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        a = getInput(scanner);
        System.out.print("Jumlah uang yang diambil : ");
        b = getInput(scanner);
        
        Tabungan tabungan = new Tabungan(Integer.parseInt(a));
        c = Integer.toString(tabungan.ambilUang(Integer.parseInt(b)));
        
        System.out.println("Saldo Anda Sekarang : ".concat(c));
    }
}
