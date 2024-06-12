package Views;
import Models.User;

public class UserView {

  public static void main(String[] args) {
    User caja= new User("Juan ","33232","juan@gmail.com","12345","cliente","si","1212121","sd","3553");
   System.out.println(caja.getNombre());
   caja.setNombre("Pedro");
   System.out.println( "Nuevo nombre "+caja.getNombre());
   System.out.println(caja.getDireccion());
  } 

}
