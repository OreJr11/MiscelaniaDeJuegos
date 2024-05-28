package labfinal_java_jjct_aiaj_odlb;

import java.util.Random;
import java.util.Scanner;

public class LabFinal_Java_JJCT_AIAJ_ODLB {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean Validacion = false;
        Random numero = new Random();
        Random ran = new Random();
        int op, num, D1, D2, D3, D4, d1, d2, d3, d4, num2, i, f, p, dado1, dado2, acumulado1, acumulado2, valor1, valor2, juego;
        op = 1;
        while (op != 0) {
            System.out.println("Bienvenido al programa");
            System.out.println("Elija una opcion:");
            System.out.println("1. Para Punto y Fama");
            System.out.println("2. Para Dados");
            System.out.println("3. Para Margarita");
            System.out.println("0. Para salir");
            op = leer.nextInt();
            while (op < 0 | op > 3) {
                System.out.println("Opcion no valida");
                System.out.println("Elija una opcion:");
                System.out.println("1. Para Punto y Fama");
                System.out.println("2. Para Dados");
                System.out.println("3. Para Margarita");
                System.out.println("0. Para salir");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    i = 1;
                    D1 = 0;
                    D2 = 0;
                    D3 = 0;
                    D4 = 0;
                    num = 0;
                    while (Validacion == false) {
                        num = (numero.nextInt(9000) + 1000);
                        D1 = num / 1000;
                        D2 = (num / 100) % 10;
                        D3 = (num / 10) % 10;
                        D4 = num % 10;
                        if (D1 != D2 && D1 != D3 && D1 != D4 && D2 != D3 && D2 != D4 && D3 != D4) {
                            Validacion = true;
                        }
                    }
                    System.out.println("Intente adivinar el numero de 4 cifras (sin digitos repetidos)");
                    num2 = leer.nextInt();
                    while (num2 < 1000 | num2 > 9999) {
                        System.out.println("Número inválido, digita nuevamente");
                        num2 = leer.nextInt();
                    }
                    while (num != num2) {
                        Validacion = true;
                        f = 0;
                        p = 0;
                        d1 = num2 / 1000;
                        d2 = (num2 / 100) % 10;
                        d3 = (num2 / 10) % 10;
                        d4 = num2 % 10;
                        while (Validacion == true) {
                            d1 = num2 / 1000;
                            d2 = (num2 / 100) % 10;
                            d3 = (num2 / 10) % 10;
                            d4 = num2 % 10;
                            if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {
                                Validacion = false;
                            } else {
                                System.out.println("Combinación invalida, digite nuevamente...");
                                num2 = leer.nextInt();
                                while (num2 < 1000 | num2 > 9999) {
                                    System.out.println("Número inválido, digita nuevamente");
                                    num2 = leer.nextInt();
                                }
                            }
                        }
                        if (D1 == d1) {
                            f = f + 1;
                        }
                        if (D2 == d2) {
                            f = f + 1;
                        }
                        if (D3 == d3) {
                            f = f + 1;
                        }
                        if (D4 == d4) {
                            f = f + 1;
                        }
                        if (d1 == D2 | d1 == D3 | d1 == D4) {
                            p = p + 1;
                        }
                        if (d2 == D1 | d2 == D3 | d2 == D4) {
                            p = p + 1;
                        }
                        if (d3 == D1 | d3 == D2 | d3 == D4) {
                            p = p + 1;
                        }
                        if (d4 == D1 | d4 == D2 | d4 == D3) {
                            p = p + 1;
                        }
                        System.out.println("Famas: " + f + ", Puntos: " + p);
                        System.out.print("Digite una nueva combinación: ");
                        num2 = leer.nextInt();
                        while (num2 < 1000 | num2 > 9999) {
                            System.out.println("Número inválido, digita nuevamente");
                            num2 = leer.nextInt();
                        }
                        i = i + 1;
                    }
                    System.out.println("Ha adivinado el numero!!");
                    System.out.println("Intentos: " + i);
                    break;

                case 2:
                    i = 1;
                    acumulado1 = 0;
                    acumulado2 = 0;
                    //Ciclo para las rondas
                    do {
                        System.out.println("★★★★★★★★★★★★★★★★★★★");
                        System.out.println("★         Ronda:" + i + "          ★");
                        System.out.println("★★★★★★★★★★★★★★★★★★★ \n\n");
                        //Ciclo para el jugador 1
                        do {
                            System.out.println("★★★ Turno jugador 1 ★★★");
                            System.out.println("Introduzca un 1 para lanzar los dados");
                            juego = leer.nextInt();
                            while (juego != 1) {
                                System.out.println("introduzca un valor valido");
                                juego = leer.nextInt();
                            }
                            //Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            System.out.println("★★★★★★★★★★★★★★★");
                            System.out.println("★ Primer dado:" + dado1 + "      ★");
                            System.out.println("★ Segundo dado:" + dado2 + "     ★");
                            System.out.println("★★★★★★★★★★★★★★★ \n\n");
                            //Punto por sacar doble (El condicional evita que en la primera repetición del ciclo se incremente acumulado1)
                            if (dado1 == dado2) {
                                acumulado1 = acumulado1 + 1;
                                System.out.println("El jugador 1 ganó un punto por sacar doble");
                                System.out.println("Puntaje jugador 1:" + acumulado1);
                                System.out.println("Puntaje jugador 2:" + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor1 = dado1 + dado2;
                        //Ciclo para el jugador 2
                        do {
                            System.out.println("★★★ Turno jugador 2 ★★★");
                            System.out.println("Introduzca un 1 para lanzar los dados");
                            juego = leer.nextInt();
                            while (juego != 1) {
                                System.out.println("introduzca un valor valido");
                                juego = leer.nextInt();
                            }
                            //Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            System.out.println("★★★★★★★★★★★★★★★");
                            System.out.println("★ Primer dado:" + dado1 + "      ★");
                            System.out.println("★ Segundo dado:" + dado2 + "     ★");
                            System.out.println("★★★★★★★★★★★★★★★  \n\n");
                            //Punto por sacar doble (El condicional evita que en la primera repetición del ciclo se incremente acumulado2)
                            if (dado1 == dado2) {
                                acumulado1 = acumulado1 + 1;
                                System.out.println("El jugador 2 ganó punto por sacar doble");
                                System.out.println("Puntaje jugador 1:" + acumulado1);
                                System.out.println("Puntaje jugador 2:" + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor2 = dado1 + dado2;
                        //Comparación de resultados
                        if (valor1 > valor2) {
                            acumulado1 = acumulado1 + 3;
                            System.out.println("El jugador 1 ganó el turno");
                            i++;
                        } else {
                            if (valor1 < valor2) {
                                acumulado2 = acumulado2 + 3;
                                System.out.println("El jugador 2 ganó el turno");
                                i++;
                            } else {
                                System.out.println("Empate, la ronda se repite");
                            }
                        }
                        //Puntos para el ganador de la ronda
                        System.out.println("Puntaje jugador 1:" + acumulado1);
                        System.out.println("Puntaje jugador 2:" + acumulado2 + "\n");
                    } while (i <= 21 && acumulado1 - acumulado2 < 15 && acumulado2 - acumulado1 < 15);
                    //Ganador y puntajes
                    if (acumulado1 > acumulado2) {
                        System.out.println("El jugador 1 es el ganador");
                    } else {
                        if (acumulado2 > acumulado1) {
                            System.out.println("El jugador 2 es el ganador");
                        } else {
                            System.out.println("El partido quedo en empate");
                        }
                    }
                    System.out.println("Puntaje jugador 1:" + acumulado1);
                    System.out.println("Puntaje jugador 2:" + acumulado2);
                    break;

                case 3:
                    int p1 = 0,
                     p2 = 0,
                     p3 = 0,
                     p4 = 0,
                     p5 = 0,
                     p6 = 0,
                     p7 = 0,
                     p8 = 0,
                     p9 = 0,
                     fc,
                     turno = 1,
                     td = 0,
                     val;
                    op = 1;
                    while (op != 0) {
                        System.out.println("Bienvenido al juego de Margarita");
                        System.out.println("Jugador 1 empieza: ");
                        System.out.println("¿Que ficha desea retirar?");
                        op = leer.nextInt();
                        while (op < 1 | op > 9) {
                            System.out.println("Posicion invalida, digite nuevamente...");
                            op = leer.nextInt();
                        }
                        while (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                            switch (op) {
                                case 1:
                                    val = 0;
                                    td = 0;
                                    if (p1 == 0) {
                                        if (turno % 2 == 0) {
                                            p1 = 2;
                                        } else {
                                            p1 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p4 != 0 & p2 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(4 o 2)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 4 & fc != 2) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 4) {
                                                        if (p4 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p4 = 2;
                                                            } else {
                                                                p4 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 2) {
                                                            if (p2 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p2 = 2;
                                                                } else {
                                                                    p2 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;

                                case 2:
                                    val = 0;
                                    td = 0;
                                    if (p2 == 0) {
                                        if (turno % 2 == 0) {
                                            p2 = 2;
                                        } else {
                                            p2 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p3 != 0 & p1 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(3 o 1)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 3 & fc != 1) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 3) {
                                                        if (p3 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p3 = 2;
                                                            } else {
                                                                p3 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 1) {
                                                            if (p1 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p1 = 2;
                                                                } else {
                                                                    p1 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                                case 3:
                                    val = 0;
                                    td = 0;
                                    if (p3 == 0) {
                                        if (turno % 2 == 0) {
                                            p3 = 2;
                                        } else {
                                            p3 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p5 != 0 & p2 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(5 o 2)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 5 & fc != 2) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 5) {
                                                        if (p5 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p5 = 2;
                                                            } else {
                                                                p5 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 2) {
                                                            if (p2 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p2 = 2;
                                                                } else {
                                                                    p2 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                                case 4:
                                    val = 0;
                                    td = 0;
                                    if (p4 == 0) {
                                        if (turno % 2 == 0) {
                                            p4 = 2;
                                        } else {
                                            p4 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p6 != 0 & p1 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(6 o 1)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 6 & fc != 1) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 6) {
                                                        if (p6 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p6 = 2;
                                                            } else {
                                                                p6 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 1) {
                                                            if (p1 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p1 = 2;
                                                                } else {
                                                                    p1 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                                case 5:
                                    val = 0;
                                    td = 0;
                                    if (p5 == 0) {
                                        if (turno % 2 == 0) {
                                            p5 = 2;
                                        } else {
                                            p5 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p7 != 0 & p3 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(7 o 3)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 7 & fc != 3) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 7) {
                                                        if (p7 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p7 = 2;
                                                            } else {
                                                                p7 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 3) {
                                                            if (p3 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p3 = 2;
                                                                } else {
                                                                    p3 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }

                                    break;
                                case 6:
                                    val = 0;
                                    td = 0;
                                    if (p6 == 0) {
                                        if (turno % 2 == 0) {
                                            p6 = 2;
                                        } else {
                                            p6 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p8 != 0 & p4 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(8 o 4)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 8 & fc != 4) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 8) {
                                                        if (p8 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p8 = 2;
                                                            } else {
                                                                p8 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 4) {
                                                            if (p4 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p4 = 2;
                                                                } else {
                                                                    p4 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;

                                case 7:
                                    val = 0;
                                    td = 0;
                                    if (p7 == 0) {
                                        if (turno % 2 == 0) {
                                            p7 = 2;
                                        } else {
                                            p7 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p9 != 0 & p5 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(9 o 5)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 9 & fc != 5) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 9) {
                                                        if (p9 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p9 = 2;
                                                            } else {
                                                                p9 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 5) {
                                                            if (p5 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p5 = 2;
                                                                } else {
                                                                    p5 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                                case 8:
                                    val = 0;
                                    td = 0;
                                    if (p8 == 0) {
                                        if (turno % 2 == 0) {
                                            p8 = 2;
                                        } else {
                                            p8 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p9 != 0 & p6 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(9 o 6)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 9 & fc != 6) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 9) {
                                                        if (p9 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p9 = 2;
                                                            } else {
                                                                p9 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 6) {
                                                            if (p6 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p6 = 2;
                                                                } else {
                                                                    p6 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                                case 9:
                                    val = 0;
                                    td = 0;
                                    if (p9 == 0) {
                                        if (turno % 2 == 0) {
                                            p9 = 2;
                                        } else {
                                            p9 = 1;
                                        }
                                        System.out.println("¿Desea retirar una segunda ficha contigua?");
                                        System.out.println("1. Si");
                                        op = leer.nextInt();
                                        if (op == 1) {
                                            while (val == 0) {
                                                if (p8 != 0 & p7 != 0) {
                                                    System.out.println("No tiene fichas contiguas disponibles");
                                                    val = 1;
                                                } else {
                                                    System.out.println("¿Que ficha desea retirar(8 o 7)?");
                                                    fc = leer.nextInt();
                                                    while (fc != 8 & fc != 7) {
                                                        System.out.println("Ficha invalida, digite nuevamente..");
                                                        fc = leer.nextInt();
                                                    }
                                                    if (fc == 8) {
                                                        if (p8 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p8 = 2;
                                                            } else {
                                                                p8 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("Ficha ya tomada");
                                                        }
                                                    } else {
                                                        if (fc == 7) {
                                                            if (p7 == 0) {
                                                                if (turno % 2 == 0) {
                                                                    p7 = 2;
                                                                } else {
                                                                    p7 = 1;
                                                                }
                                                                val = 1;
                                                            } else {
                                                                System.out.println("Ficha ya tomada");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Ficha no valida");
                                        td = 1;
                                    }
                                    break;
                            }
                            if (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                                if (td == 0) {
                                    turno = turno + 1;
                                    if (turno % 2 == 0) {
                                        System.out.println("Jugador 2 sigue:");
                                    } else {
                                        System.out.println("Jugador 1 sigue:");
                                    }
                                    System.out.println("¿Que ficha desea retirar?");
                                    op = leer.nextInt();
                                    while (op < 1 | op > 9) {
                                        System.out.println("Posicion invalida, digite nuevamente...");
                                        op = leer.nextInt();
                                    }
                                } else {
                                    System.out.println("¿Que ficha desea retirar otra vez?");
                                    op = leer.nextInt();
                                    while (op < 1 | op > 9) {
                                        System.out.println("Posicion invalida, digite nuevamente...");
                                        op = leer.nextInt();
                                    }
                                }
                            }
                        }
                        if (p1 != 0 & p2 != 0 & p3 != 0 & p4 != 0 & p5 != 0 & p6 != 0 & p7 != 0 & p8 != 0 & p9 != 0) {
                            if (turno % 2 != 0) {
                                System.out.println("El jugador 1 es el ganador!!!");
                            } else {
                                if (turno % 2 == 0) {
                                    System.out.println("El jugador 2 es el ganador!!!");
                                }
                            }
                        }
                        System.out.println("Ingrese 0 para salir del juego o cualquier numero para seguir jugando");
                        op = leer.nextInt();
                    }
                    break;

            }

        }

    }

}
