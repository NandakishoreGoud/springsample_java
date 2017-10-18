package model;

public enum Distances {
Pune(0), Mumbai(200), Bangalore(1000), Delhi(2050), Chennai(1234.5);
private double distances;
Distances(double distances){
    this.distances = distances;
}
double getDistances(){
    return distances;
}
}
