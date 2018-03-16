import sun.rmi.transport.Connection;

public interface StudentDAO {
    Connection getCon();
    int insert();

}
