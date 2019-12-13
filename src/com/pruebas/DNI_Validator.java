package com.pruebas;

public class DNI_Validator {

    /**
     *  Comprobación de si el DNI es correcto/válido
     */
       String personaDNI = "12345679s";
       String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

          String TotalDNI = "";
          int sumaTotalDNI;
          int modDNI;


          void validate(){
              for (int i = 0; i < personaDNI.length()-1; i++) {

                  TotalDNI = TotalDNI + personaDNI.charAt(i);

                  System.out.println("Valor: " + TotalDNI + "\n");
              }
              sumaTotalDNI = Integer.parseInt(TotalDNI);
              System.out.println("Total: " + sumaTotalDNI);
              modDNI = sumaTotalDNI%23;
              letrasDNI.charAt(modDNI);
              System.out.println("Mod: " + modDNI + "\n");

              if(personaDNI.toUpperCase().charAt(personaDNI.length()-1) != letrasDNI.charAt(modDNI)){
                  //Error en la letra del DNI
                  System.out.println("DNI incorrecto");
              }else{
                      //Continuamos con el código
                      System.out.println("------------------------------------");
                      System.out.println("Funciona");
                      System.out.println("------------------------------------");
              }
          }
}
