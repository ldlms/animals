public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void takeOff() {
		if(!this.isFlying() && this.altitude == 0) {
			this.flying = true;
			System.out.printf("L'aigle %s s'envole \n",this.getName());
		}
		
	}

	@Override
	public int flyUp(int meters) {
		if(this.isFlying()) {
			this.altitude = Math.max(this.altitude + meters,0);
			System.out.printf("%s monte a %d d'altitude \n", this.getName(),this.getAltitude());
		}
		return this.getAltitude();
	}

	@Override
	public int flyDown(int meters) {
		if(this.isFlying()) {
			this.altitude = Math.min(this.altitude - meters, 360);
			System.out.printf("%s descend a %d d'altitude \n", this.getName(),this.getAltitude());
		}
		return this.getAltitude();
	}

	@Override
	public void land() {
		if(this.getAltitude() > 1) {
			System.out.printf("%s ne peut pas atterir, il est trop haut de %d métres\n",this.getName(),this.getAltitude());
		}else {
			System.out.printf("%s vient d'atterir \n",this.getName());
		}
		
	}

	@Override
	public void glide() {
		if(this.isFlying()) {
			System.out.printf("%s vole...\n",this.getName());
		}
		
	}
}
