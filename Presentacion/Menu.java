package Presentacion ;

import java.util.Scanner ;
import java.util.ArrayList ;
import LogicaNegocio.Tiendita ;
import LogicaNegocio.TiposMensaje.Mensaje ;

public class Menu{

  private Tiendita tienda ;

  public Menu( Tiendita tienda ){

    this.tienda = tienda ;

  }

  public void iniciar( ){

    Scanner leer = new Scanner( System.in ) ;

    int opcion = 0 ;
    
    while( opcion != 2 ){
      System.out.println( );
      System.out.println( ) ;
      System.out.println(  ) ;

      System.out.println( "EPIC GAMES " ) ;

      System.out.println( "1   Tienda de Epic Games " ) ;

      System.out.println( "2   Salir " ) ;

      System.out.println( ) ;
      opcion = leer.nextInt( ) ;
      System.out.println( ) ;

      if( opcion == 1 ){

        ArrayList < String > juegos = tienda.obtenerJuegos( ) ;

        for( int i = 0 ; i < juegos.size( ) ; i++ ){

          System.out.println( ( i + 1 ) + "   Juego  :  " + juegos.get( i ) ) ;

        }
        System.out.println( ) ;
        System.out.println( " Que juego quieres comprar? :) " ) ;
        System.out.println( ) ;

        int num = leer.nextInt( ) ;
        System.out.println( ) ;

        if( num >= 1 && num <= juegos.size( ) ){

          Mensaje factura = tienda.comprarJuego( num - 1 ) ;

          System.out.println( factura.mostrarFacturita( ) ) ;

        }else{

          System.out.println( "Ese juego no existe " ) ;

        }

      }else if( opcion == 2 ){

        System.out.println( " Gracias por visitar Epic Games vuelva prontos" ) ;
        System.out.println( ) ;

        mostrarBiblioteca( ) ;

      }else{

        System.out.println( "Opcion no valida intenta de nuevo... " ) ;

      }

    }

  }

  private void mostrarBiblioteca( ){

    System.out.println( "Tu Biblioteca actual de Epic Games :P " ) ;
    System.out.println( ) ;

    ArrayList < String > biblioteca = tienda.obtenerBiblioteca( ) ;

    if( biblioteca.size( ) == 0 ){

      System.out.println( "No compraste ningun juego... que pena :(" ) ;

    }else{

      for( int i = 0 ; i < biblioteca.size( ) ; i++ ){

        System.out.println( ( i + 1 ) + "    " + biblioteca.get( i ) ) ;

      }

    }

    System.out.println( ) ;
    System.out.println( ) ;
    System.out.println( ) ;

  }

}
