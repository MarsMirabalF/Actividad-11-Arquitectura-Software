package AccesoDatos ;

import java.util.ArrayList ;

public class BaseDatos implements Datos{

  private static BaseDatos miBase ;

  private ArrayList < Juego > juegos ;

  private ArrayList < String > jueguitos ;

  private BaseDatos( ){

    juegos = new ArrayList < Juego > ( ) ;

    jueguitos = new ArrayList < String > ( ) ;

    juegos.add( new Juego( "Hollow Knight" , 80.0 ) ) ;

    juegos.add( new Juego( "Resident Evil 4 Remake" , 250.0 ) ) ;

    juegos.add( new Juego ( "Dragon Ball Xenoverse" , 60.0 ) ) ;

    juegos.add( new Juego( "Hotline Miami 2" , 150.0 ) ) ;

    juegos.add( new Juego ( "The Evil Within 2" , 100.0 ) ) ;

  }

  public static BaseDatos obtInstancia( ){

    if( miBase== null ){

      miBase = new BaseDatos( ) ;

    }

    return miBase ;

  }

  public ArrayList < Juego > obtenerJuegos( ){

    return juegos;

  }

  public void agregarJueguito( String texto ){

    jueguitos.add( texto ) ;

  }

  public ArrayList < String > obtenerJueguitos( ){

    return jueguitos  ;

  }

}
