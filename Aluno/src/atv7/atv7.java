/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class atv7 {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Aluno victor = new Aluno(a, b);
        victor.calcularMedia();
        System.out.println(victor.getMedia());
     }
}
