package week3;
import java.util.ArrayList;
public class DriverCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Car> store = new ArrayList();
store.add(new Car());
store.add(new Car());
store.add(new Car());
store.add(new Car());
store.add(new Car());

store.get(0).setCompany("BMW");
store.get(0).setHp(375);
store.get(0).setMake(2020);
store.get(0).setMileage(6);
store.get(0).setModel("x6");

store.get(1).setCompany("mercedis");
store.get(1).setHp(500);
store.get(1).setMake(2016);
store.get(1).setMileage(7);
store.get(1).setModel("cls");


store.get(2).setCompany("Toyota");
store.get(2).setHp(600);
store.get(2).setMake(2022);
store.get(2).setMileage(5);
store.get(2).setModel("Innova");



store.get(3).setCompany("Nissan");
store.get(3).setHp(400);
store.get(3).setMake(2023);
store.get(3).setMileage(6);
store.get(3).setModel("patrol");



store.get(4).setCompany("Porsch");
store.get(4).setHp(700);
store.get(4).setMake(2018);
store.get(4).setMileage(9);
store.get(4).setModel("cayenne");
System.out.println(store);

store.add(1, new Car());
store.get(1).setCompany("gfv");
store.get(1).setHp(200);
store.get(1).setMake(2015);
store.get(1).setMileage(11);
store.get(1).setModel("k3r");
System.out.println(store);

System.out.println();
//sort by mileage
store.sort((Car c1 , Car c2)->c1.getMileage()-c2.getMileage());
System.out.println(store);
//sort by model
store.sort((Car c1 , Car c2)-> c1.getModel().compareTo(c2.getModel()));
System.out.println(store);
//sort in decreasing Hp
store.sort((Car c1 , Car c2)->c2.getHp()-c1.getHp());
System.out.println(store);
	}

}
