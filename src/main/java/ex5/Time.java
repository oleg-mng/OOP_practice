package ex5;

class Time {
    int hour;
    int s = 100;

    public int payTime(int money) {
        hour = money / s;
        return hour;
    }
}
