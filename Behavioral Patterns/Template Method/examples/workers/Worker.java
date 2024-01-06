public abstract class Worker {
    public final void dailyRoutine() {
        wakeUp();
        eatBreakfast();
        work();
        returnHome();
        sleep();
    }

    final void wakeUp() {
        System.out.println("waking up...");
    }

    final void eatBreakfast() {
        System.out.println("eating breakfast...");
    }

    abstract void work();

    final void returnHome() {
        System.out.println("going back home...");
    }

    final void sleep() {
        System.out.println("going to sleep...");
    }

}