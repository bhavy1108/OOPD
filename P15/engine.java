public class engine
{
	private String fuel;
	private int cyclinder;

	public engine ()
	{
		fuel = new String("DIESEL");
		cyclinder = 10;
	}

	public engine( engine inengine)
	{
		fuel = inengine.getfuel();
		cyclinder = inengine.getcyclinder();
	}

	public engine(String infuel, int incyclinder)
	{
		if ((infuel != null) && validatecyc(incyclinder))
		{
			fuel = infuel;
			cyclinder = incyclinder;
		}
		 else
		 {
			 throw new IllegalArgumentException("Invalid Values");
		 }
	}

	public String getfuel()
	{
		return fuel;
	}

	public int getcyclinder()
	{
		return cyclinder;
	}

	public void setfuel(String infuel)
	{
		if (validatefuel(infuel))
		{
			fuel = infuel;
		}
		else 
		{
			throw new IllegalArgumentException("Invalid fuel");
		}
	}

	public void setcyclinder(int incyclinder)
	{
		if (validatecyc(incyclinder))
		{
			cyclinder = incyclinder;
		}
		else
		{
			throw new IllegalArgumentException("Invalid cyclinder");
		}
	}

	public engine clone()
	{
		engine cloneEngine;
		cloneEngine = new engine(this.fuel, this.cyclinder);
		return cloneEngine;
	}

	public boolean equals(Object inObj)
	{
		boolean same = false;
		if (inObj instanceof engine)
		{
			engine inengine = (engine) inObj;
			if(fuel.equals(inengine.getfuel()))
				if (Math.abs(cyclinder - inengine.getcyclinder()) < 1)
					same =true;
		}
		return same;
	}

	public String toString()
	{
		return("Fuel: " + fuel + " Cyclinder:" + cyclinder );
	}

	private boolean validatecyc (double incyclinder)
	{
		return((incyclinder >= 2) && (incyclinder<= 20));
	}

	private boolean validatefuel (String infuel)
	{
		return ((infuel == "BATTERY") || (infuel == "DIESEL") || (infuel== "BIO"));
	}


}
