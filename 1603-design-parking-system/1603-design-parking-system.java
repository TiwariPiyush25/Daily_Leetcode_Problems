class ParkingSystem {
    List<Integer> BigParking; 
    List<Integer> MediumParking; 
    List<Integer> SmallParking;

    int b,m,s;

    public ParkingSystem(int big, int medium, int small) {
        b = big; m = medium; s = small;

        BigParking = new ArrayList<>();
        MediumParking = new ArrayList<>();
        SmallParking = new ArrayList<>();
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && BigParking.size() >= b) return false;
        if(carType == 2 && MediumParking.size() >= m) return false;
        if(carType == 3 && SmallParking.size() >= s) return false;

        if(carType == 1) BigParking.add(1);
        if(carType == 2) MediumParking.add(2);
        if(carType == 3) SmallParking.add(3);

        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */