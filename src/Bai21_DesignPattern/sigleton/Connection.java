package Bai21_DesignPattern.sigleton;

public class Connection {
    private static Connection _instance;

    private Connection(){
    }

    public Connection getInstance(){
        if(_instance == null){
            synchronized (Connection.class){
                if(_instance == null)
                    _instance = new Connection();
            }
        }

        return _instance;
    }
}
