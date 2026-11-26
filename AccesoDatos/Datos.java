package AccesoDatos ;

import java.util.ArrayList ;

public interface  Datos {

  ArrayList < Juego > obtenerJuegos( ) ;

  void agregarJueguito( String texto ) ;

  ArrayList < String > obtenerJueguitos( ) ;

}
