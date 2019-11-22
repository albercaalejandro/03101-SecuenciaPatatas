/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */

public class Main {

    public static void main(String[] args) {
        final String NAME = "Jaimito";
        final String ARTICULO = "Patatas";
        final String ARTICULO_IMPREV = "Piruleta";
        final double PRECIO_PATATAS = 0.3;
        final double DINERO_OTORGADO = 1;
        final double PRECIO_PIRULETA = 0.2;
        final double CANTIDAD_PEDIDA = 3;
        
        double dDevuelto = DINERO_OTORGADO - PRECIO_PIRULETA;
        double vMadre;
        int nKilos = (int) (dDevuelto / PRECIO_PATATAS);
        vMadre = dDevuelto -(nKilos * PRECIO_PATATAS);
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        System.out.println("Persona encargada .....: "+ NAME);
        System.out.println("Artículo encargado ....: "+ ARTICULO);
        System.out.println("Cantidad encargada ....: "+CANTIDAD_PEDIDA+" kg");
        System.out.println("---");
        System.out.println("Precio encargo ........: "+PRECIO_PATATAS+ "€/kg");
        System.out.println("Dinero suministrado ...: "+DINERO_OTORGADO+" €");
        System.out.println("---");
        System.out.println("Artículo imprevisto ...: "+ARTICULO_IMPREV);
        System.out.println("Precio imprevisto .....: "+PRECIO_PIRULETA+" €");
        System.out.println("---");
        System.out.println("Cantidad comprada .....: "+nKilos+" kg");
        System.out.printf("Dinero devuelto .......: %.02f € %n ",vMadre);
        
        
        
        
    }
}
