public class Physics {
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initialvelocity, float acceleration , int time){
        return initialvelocity + (acceleration * time);
    }

}

