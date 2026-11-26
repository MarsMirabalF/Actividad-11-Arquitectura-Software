import Presentacion.Menu ;
import LogicaNegocio.Tiendita ;
import LogicaNegocio.Descuentos.TipoDesc ;
import LogicaNegocio.Descuentos.DescHalloween ;
import LogicaNegocio.Observadores.ObsGracias ;
import LogicaNegocio.Observadores.ObsHistorial ;
import AccesoDatos.Datos ;
import AccesoDatos.BaseDatos ;

public class Main{

  public static void main( String [ ] args ){

    Datos datos = BaseDatos.obtInstancia( ) ;

    TipoDesc descuento = new DescHalloween( ) ;

    Tiendita tienda = new Tiendita( datos , descuento ) ;

    tienda.agregarObs( new ObsGracias( ) ) ;

    tienda.agregarObs( new ObsHistorial( datos ) ) ;

    Menu menu = new Menu( tienda ) ;

    menu.iniciar( ) ;

  }

}
