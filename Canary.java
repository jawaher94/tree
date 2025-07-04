class Canary extends Bird {

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    public boolean canSing() {
        return true;
    }
}
