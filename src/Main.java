import Ctrl.PetCtrl;
import Model.Pet;
import Serv.IRepository;
import Serv.PetRepository;
import UI.ConsoleMenu;

public class Main {
    public static void main(String[] args) throws Exception {

        IRepository<Pet> myFarm = new PetRepository();
        PetCtrl controller = new PetCtrl(myFarm);
        new ConsoleMenu(controller).start();
    }
}