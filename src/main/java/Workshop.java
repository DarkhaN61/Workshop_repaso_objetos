import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        int m = 0;
        if(a > b){
            if(a > c) {
                m = a;
            }
            else {
                m = c;
            }
        }
        else {
            if(b>a) {
                if (b>c){
                    m = b;
                }
                else {
                    m = c;
                }
            }

        }
        return m;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
       int[]z = new int[limite];
       int j = 1;
       for(int i= 0; i < z.length; i++ ){
           z[i] = numero * j++;
       }
        return z;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        int i,f = 1;
        for(i = 1; i<= n; ++i ){
            f = f * i;
        }
        return f;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        boolean m = true;
        if (numero<=1) {
            m = false;
        }
        else if (numero == 2) {
            m = true;
        }
        else {
            for (int i = 2; i < numero; ++i){
                if(numero % i == 0){
                    m = false;
                    }
                else {
                    m = true;
                }
            }
        }
        return m;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        int[]x = new int[n];
        int a = 0, b = 1, c;
        for (int i = 0; i<n; ++i){
            x[i]= a;
            c = a + b;
            a = b;
            b = c;
        }
        return x;
    }


    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;
        for(int i : arreglo ){
            suma = suma + i;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        int[]x = arreglo;
        int a = 0;
         double promedio = 0;
         for (int i = 0; i< x.length; i++){
             a= a + x[i];
         }
        promedio = a /x.length;
        return promedio ;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int[]x = arreglo;
        int mayor = 0;
        for (int i = 0; i<x.length; i++){
         if (x[i]>mayor){
             mayor = x[i];
         }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int[]x = arreglo;
        int menor = 0;
        for (int i = 0; i<x.length; i++){
            if (x[i]< menor){
                menor = x[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        return new int[0];
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        return new int[0];
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        return new int[0];
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        return new int[0];
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        return new int[0];
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        return 0;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        cadena = new StringBuilder(cadena).reverse().toString();
        return cadena;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        return false;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        return 0;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        String m = "";
        int modulo;
        if (numero == 0){
            m = String.valueOf(0);
        }
        else {
            if (numero<0){
            numero = Math.abs(numero);
            while (numero != 0) {
                modulo = numero % 2;
                m = m + modulo;
                numero = numero / 2;
            }
            m = new StringBuilder(m).reverse().toString();
            m = "-"+ m;
            }
            else{
                while (numero != 0) {
                    modulo = numero % 2;
                    m = m + modulo;
                    numero = numero / 2;
                }
                m = new StringBuilder(m).reverse().toString();
            }
        }
        return m;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        String m = "", c="0123456789ABCDEF";
        int modulo;
        if (numero == 0){
            m = String.valueOf(0);
        }
        else {
            if (numero<0){
                numero = Math.abs(numero);
                while (numero != 0) {
                    modulo = numero % 16;
                    m = c.charAt(modulo)+m;
                    numero = numero / 16;
                }
                m = new StringBuilder(m).reverse().toString();
                m = "-"+ m;
            }
            else{
                while (numero != 0) {
                    modulo = numero % 16;
                    m = c.charAt(modulo)+m;
                    numero = numero / 16;
                }
                m = new StringBuilder(m).reverse().toString();
            }
        }
        return m;

    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
            return Math.PI * Math.pow(radio, 2) ;
    }
    public String zoodiac(int day, int month) {
        String m = "";
        if (day > 31) {
            m = "Invalid Date";
        }
        if (month > 31) {
           m ="Invalid Date";
        }
        if (day < 1) {
            m = "Invalid Date";
        }
        if (month < 1) {
            m= "Invalid Date";
        }
        else {
            if (month == 1) {
                if (day <= 20) {
                    return "capricornio";
                } else {
                   m ="acuario";
                }
            }
            if (month== 2) {
                if(day <= 29 ) {
                    if (day<= 19) {
                        m= "acuario";
                    }
                    else {
                        m = "Pisces";
                    }
                }
                else {
                    m = "Invalid Date";
                }
            }
            if (month == 3) {
                if (day <= 20) {
                    m ="Pisces";
                } else {
                    m = "Aries";
                }
            }
            if (month == 4) {
                if (day <= 20) {
                    m = "Aries";
                } else {
                    m = "tauro";
                }
            }
            if (month == 5) {
                if (day <= 20) {
                   m = "tauro";
                } else {
                   m = "Gemini";
                }
            }
            if (month == 6) {
                if (day <= 20) {
                   m = "Gemini";
                } else {
                    m = "Cancer";
                }
            }
            if (month == 7) {
                if (day <= 22) {
                    m = "Cancer";
                } else {
                    m = "Leo";
                }
            }
            if (month == 8) {
                if (day <= 23) {
                   m = "Leo";
                } else {
                    m ="virgo";
                }
            }
            if (month == 9) {
                if (day <= 22) {
                    m = "virgo";
                } else {
                    m = "libra";
                }
            }
            if (month == 10) {
                if (day <= 23) {
                   m = "libra";
                } else {
                    m = "escorpio";
                }
            }
            if (month == 11) {
                if (day <= 22) {
                    m ="escorpio";
                } else {
                    m= "sagitario";
                }
            }
            if (month == 12) {
                if (day <= 21) {
                    m = "sagitario";
                } else {
                   m = "capricornio";
                }
            }
        }
        return m ;
    }
}

