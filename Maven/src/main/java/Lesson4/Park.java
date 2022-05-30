package Lesson4;

public class Park {
    int attractionsAmount;
    Attraction[] attractions;
    int count = 0;

    public static void main(String[] args) {
        Park park = new Park(5);
        park.addAttraction(Park.createAttraction("carousel1", 12, 500));
        park.addAttraction(Park.createAttraction("carousel2", 8, 40));
        park.addAttraction(Park.createAttraction("carousel3", 5, 600));
        park.addAttraction(Park.createAttraction("carousel4", 6, 800));
        park.addAttraction(Park.createAttraction("carousel5", 10, 300));
        park.showAttractions();
    }
    static class Attraction{
        private String info;
        private int price, time;
        public Attraction(String info, int time, int price){
            this.info = info;
            this.time = time;
            this.price = price;
        }
        public void showInfo(){
            System.out.println(info + ", time: " + time + ", price: " + price);
        }
    }
    public Park(int attractionsAmount){
        attractions  = new Attraction[attractionsAmount];
    }
    public static Attraction createAttraction(String info, int time, int price){
        return new Attraction(info, time, price);
    }
    public void addAttraction(Attraction attraction){
        if(count<attractions.length)
           attractions[count++] = attraction;
    }
    public void showAttractions(){
        for(Attraction attraction: attractions){
            attraction.showInfo();
        }
    }
}
