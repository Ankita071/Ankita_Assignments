package assignment03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Answer7 {
	public static void main(String[] args) {
		Parked_CarOwnerList.initialize();

		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10001", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10002", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10003", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10004", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10005", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10006", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10007", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10008", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10009", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10010", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10011", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10012", 99999999, null));
		Parked_CarOwnerList.add_new_car(new Parked_CarOwner_Details("Xyz", "Abc", "10015", 99999999, null));
		
		
		Parked_CarOwnerList.view();
		
		Parked_CarOwnerList.get_parked_car_location("10010");
	}
}

class Parked_CarOwner_Details{
	private String ownerName;
	private String carModel;
	private String carNO;
	private long ownerMobileNo;
	private String ownerAddress;
	public Parked_CarOwner_Details(String ownerName, String carModel, String carNO, long ownerMobileNo, String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNO() {
		return carNO;
	}
	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

	
}
class Parked_CarOwnerList{
	
	private static Map<Integer, Parked_CarOwner_Details> map =new HashMap<>();
	
	static void initialize() {
		for(Integer i=1;i<=240;i++) {
			map.put(i, null);
		}
	}
	
	static void add_new_car(Parked_CarOwner_Details obj) {
		Integer key=null;
		Set<Entry<Integer, Parked_CarOwner_Details>> entrySet = map.entrySet();
		for (Entry<Integer, Parked_CarOwner_Details> entry : entrySet) {
			if(entry.getValue()==null) {
				key=entry.getKey();
				break;
			}
		}
		if(key==null) {
			System.out.println("Parking lot full!! No more insertion possible");
		}
		else {
			map.put(key, obj);
		}
	}
	static void remove_car(String number) {
		Parked_CarOwner_Details removed_car=null;
		Integer key=null;
		Set<Entry<Integer, Parked_CarOwner_Details>> entrySet = map.entrySet();
		for (Entry<Integer, Parked_CarOwner_Details> entry : entrySet) {
			if(number.equals(entry.getValue().getCarNO())) {
				key=entry.getKey();
				removed_car=entry.getValue();
				break;
			}
		}
		if(key==null) {
			System.out.println("Car doesn't exist");
		}
		else {
			map.put(key, null);
			System.out.println("Removed car : "+removed_car);
		}
		
	}
	static void get_parked_car_location(String number) {
		try {
			Integer key=null;
			Set<Entry<Integer, Parked_CarOwner_Details>> entrySet = map.entrySet();
			for (Entry<Integer, Parked_CarOwner_Details> entry : entrySet) {
				if(number.equals(entry.getValue().getCarNO())) {
					key=entry.getKey();
					break;
				}
			}
			int floor,section,slot;
			int temp=key;
			floor=(temp/80);
			temp=temp%80;
			if(temp==0) {
				System.out.println("Car is in : Floor no : "+floor+" Section : "+4+" Slot : "+20);
			}
			else{
				floor+=1;
				section=(temp/20);
				temp=temp%20;
				if(temp==0) {
					System.out.println("Car is in : Floor no : "+floor+" Section : "+section+" Slot : "+20);
				}
				else {
					section+=1;
					slot=temp%20;
					System.out.println("Car is in : Floor no : "+floor+" Section : "+section+" Slot : "+slot);
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Car not found !!!!");
		}
	}
	static void view() {
		Set<Entry<Integer, Parked_CarOwner_Details>> entrySet = map.entrySet();
		for (Entry<Integer, Parked_CarOwner_Details> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}	
}


