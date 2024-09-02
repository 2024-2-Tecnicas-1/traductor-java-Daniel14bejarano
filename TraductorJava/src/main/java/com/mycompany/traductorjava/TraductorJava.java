
package com.mycompany.idiomas;

import java.util.HashMap;
import java.util.Scanner;


public class Idiomas {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        HashMap<Integer, String>hash=new HashMap<>();
        
        hash.put(0, "cero");
        hash.put(1, "uno"); 
        hash.put(2, "dos"); 
        hash.put(3, "tres"); 
        hash.put(4, "cuatro"); 
        hash.put(5, "cinco"); 
        hash.put(6, "seis"); 
        hash.put(7, "siete"); 
        hash.put(8, "ocho"); 
        hash.put(9, "nueve"); 
        hash.put(10, "diez"); 
        
        hash.put(11, "once"); 
        hash.put(12, "doce"); 
        hash.put(13, "trece"); 
        hash.put(14, "catorce"); 
        hash.put(15, "quince"); 
        hash.put(16, "dieciseis"); 
        hash.put(17, "dieciete"); 
        hash.put(18, "dieciocho"); 
        hash.put(19, "diecinueve"); 
        hash.put(20, "veinte"); 
        
        hash.put(21, "veintiuno"); 
        hash.put(22, "veintidos"); 
        hash.put(23, "veintitres"); 
        hash.put(24, "veinticuatro"); 
        hash.put(25, "veinticinco"); 
        hash.put(26, "veintiseis"); 
        hash.put(27, "veintisiete"); 
        hash.put(28, "veintiocho"); 
        hash.put(29, "veintinueve");
        
        hash.put(30, "treinta"); 
        hash.put(31, "treintaiuno"); 
        hash.put(32, "treintaidos"); 
        hash.put(33, "treintaitres"); 
        hash.put(34, "treintaicuatro"); 
        hash.put(35, "treintaicinco"); 
        hash.put(36, "treintaiseis"); 
        hash.put(37, "treintaisiete"); 
        hash.put(38, "treintaiocho"); 
        hash.put(39, "treintainueve"); 
        
        hash.put(40, "cuarenta");
        hash.put(41, "cuarentaiuno"); 
        hash.put(42, "cuarentaidos"); 
        hash.put(43, "cuarentaitres"); 
        hash.put(44, "cuarentaicuatro"); 
        hash.put(45, "cuarentaicinco"); 
        hash.put(46, "cuarentaiseis"); 
        hash.put(47, "cuarentaisiete"); 
        hash.put(48, "cuarentaiocho"); 
        hash.put(49, "cuarentainueve"); 
        
        hash.put(50, "cincuenta"); 
        hash.put(51, "cincuenta y uno");
        hash.put(52, "cincuenta y dos");
        hash.put(53, "cincuenta y tres");
        hash.put(54, "cincuenta y cuatro");
        hash.put(55, "cincuenta y cinco");
        hash.put(56, "cincuenta y seis");
        hash.put(57, "cincuenta y siete");
        hash.put(58, "cincuenta y ocho");
        hash.put(59, "cincuenta y nueve");

        hash.put(60, "sesenta");
        hash.put(61, "sesenta y uno");
        hash.put(62, "sesenta y dos");
        hash.put(63, "sesenta y tres");
        hash.put(64, "sesenta y cuatro");
        hash.put(65, "sesenta y cinco");
        hash.put(66, "sesenta y seis");
        hash.put(67, "sesenta y siete");
        hash.put(68, "sesenta y ocho");
        hash.put(69, "sesenta y nueve");

        hash.put(70, "setenta");
        hash.put(71, "setenta y uno");
        hash.put(72, "setenta y dos");
        hash.put(73, "setenta y tres");
        hash.put(74, "setenta y cuatro");
        hash.put(75, "setenta y cinco");
        hash.put(76, "setenta y seis");
        hash.put(77, "setenta y siete");
        hash.put(78, "setenta y ocho");
        hash.put(79, "setenta y nueve");

        hash.put(80, "ochenta");
        hash.put(81, "ochenta y uno");
        hash.put(82, "ochenta y dos");
        hash.put(83, "ochenta y tres");
        hash.put(84, "ochenta y cuatro");
        hash.put(85, "ochenta y cinco");
        hash.put(86, "ochenta y seis");
        hash.put(87, "ochenta y siete");
        hash.put(88, "ochenta y ocho");
        hash.put(89, "ochenta y nueve");

        hash.put(90, "noventa");
        hash.put(91, "noventa y uno");
        hash.put(92, "noventa y dos");
        hash.put(93, "noventa y tres");
        hash.put(94, "noventa y cuatro");
        hash.put(95, "noventa y cinco");
        hash.put(96, "noventa y seis");
        hash.put(97, "noventa y siete");
        hash.put(98, "noventa y ocho");
        hash.put(99, "noventa y nueve");

        hash.put(100, "cien");
        
        
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("La suma de "+ hash.get(a)+ " más "+ hash.get(b)+ " es igual a "+hash.get(c));
        
        hash.put(0, "zero");
        hash.put(1, "one");
        hash.put(2, "two");
        hash.put(3, "three");
        hash.put(4, "four");
        hash.put(5, "five");
        hash.put(6, "six");
        hash.put(7, "seven");
        hash.put(8, "eight");
        hash.put(9, "nine");
        hash.put(10, "ten");
        hash.put(11, "eleven");
        hash.put(12, "twelve");
        hash.put(13, "thirteen");
        hash.put(14, "fourteen");
        hash.put(15, "fifteen");

        hash.put(16, "sixteen");
        hash.put(17, "seventeen");
        hash.put(18, "eighteen");
        hash.put(19, "nineteen");

        hash.put(20, "twenty");
        hash.put(21, "twenty-one");
        hash.put(22, "twenty-two");
        hash.put(23, "twenty-three");
        hash.put(24, "twenty-four");
        hash.put(25, "twenty-five");
        hash.put(26, "twenty-six");
        hash.put(27, "twenty-seven");
        hash.put(28, "twenty-eight");
        hash.put(29, "twenty-nine");

        hash.put(30, "thirty");
        hash.put(31, "thirty-one");
        hash.put(32, "thirty-two");
        hash.put(33, "thirty-three");
        hash.put(34, "thirty-four");
        hash.put(35, "thirty-five");
        hash.put(36, "thirty-six");
        hash.put(37, "thirty-seven");
        hash.put(38, "thirty-eight");
        hash.put(39, "thirty-nine");

        hash.put(40, "forty");
        hash.put(41, "forty-one");
        hash.put(42, "forty-two");
        hash.put(43, "forty-three");
        hash.put(44, "forty-four");
        hash.put(45, "forty-five");
        hash.put(46, "forty-six");
        hash.put(47, "forty-seven");
        hash.put(48, "forty-eight");
        hash.put(49, "forty-nine");

        hash.put(50, "fifty");
        hash.put(51, "fifty-one");
        hash.put(52, "fifty-two");
        hash.put(53, "fifty-three");
        hash.put(54, "fifty-four");
        hash.put(55, "fifty-five");
        hash.put(56, "fifty-six");
        hash.put(57, "fifty-seven");
        hash.put(58, "fifty-eight");
        hash.put(59, "fifty-nine");

        hash.put(60, "sixty");
        hash.put(61, "sixty-one");
        hash.put(62, "sixty-two");
        hash.put(63, "sixty-three");
        hash.put(64, "sixty-four");
        hash.put(65, "sixty-five");
        hash.put(66, "sixty-six");
        hash.put(67, "sixty-seven");
        hash.put(68, "sixty-eight");
        hash.put(69, "sixty-nine");

        hash.put(70, "seventy");
        hash.put(71, "seventy-one");
        hash.put(72, "seventy-two");
        hash.put(73, "seventy-three");
        hash.put(74, "seventy-four");
        hash.put(75, "seventy-five");
        hash.put(76, "seventy-six");
        hash.put(77, "seventy-seven");
        hash.put(78, "seventy-eight");
        hash.put(79, "seventy-nine");

        hash.put(80, "eighty");
        hash.put(81, "eighty-one");
        hash.put(82, "eighty-two");
        hash.put(83, "eighty-three");
        hash.put(84, "eighty-four");
        hash.put(85, "eighty-five");
        hash.put(86, "eighty-six");
        hash.put(87, "eighty-seven");
        hash.put(88, "eighty-eight");
        hash.put(89, "eighty-nine");

        hash.put(90, "ninety");
        hash.put(91, "ninety-one");
        hash.put(92, "ninety-two");
        hash.put(93, "ninety-three");
        hash.put(94, "ninety-four");
        hash.put(95, "ninety-five");
        hash.put(96, "ninety-six");
        hash.put(97, "ninety-seven");
        hash.put(98, "ninety-eight");
        hash.put(99, "ninety-nine");

        hash.put(100, "one hundred");
        
        System.out.println("The sum of "+hash.get(a)+ " plus "+hash.get(b)+ " is "+hash.get(c) );
        
        
        
        
    }
}
