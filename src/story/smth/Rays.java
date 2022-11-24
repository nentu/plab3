package story.smth;

import story.abstractions.Place;

import java.util.Objects;

public class Rays {
    private String name;
    private Place lostPlace;

    public Rays(TypeOfRays typesOfRays){
        name = typesOfRays.getName();
        System.out.print(this.getName()+' ');
    }

    public void lost(Place place){
        this.lostPlace = place;
        System.out.print(this.getLostPlaceString()+' ');
    }

    public String getName() {
        return name;
    }

    public Place getLostPlace() {
        return lostPlace;
    }
    
    public String getLostPlaceString(){
        return "потерялись в "+this.getLostPlace().getPlace(false);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Rays rays = (Rays) otherObject;
        return Objects.equals(getName(), rays.getName()) && Objects.equals(getLostPlace(), rays.getLostPlace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), getName(), getLostPlace());
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", lostPlace=" + lostPlace +
                '}';
    }
}