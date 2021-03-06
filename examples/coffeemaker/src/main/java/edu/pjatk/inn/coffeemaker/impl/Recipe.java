package edu.pjatk.inn.coffeemaker.impl;

import sorcer.core.context.ServiceContext;
import sorcer.core.invoker.IntegerIncrementor;
import sorcer.service.Context;
import sorcer.service.ContextException;

import java.io.Serializable;

/**
 * COPYRIGHT (C) 2016 Sarah & Mike. All Rights Reserved.
 * Recipe class for the coffee maker.
 *
 * @author   Sarah & Mike
 */

public class Recipe implements Serializable {
    private String name;
    private int price;
    private int amtCoffee;
    private int amtMilk;
    private int amtSugar;
    private int amtChocolate;

	/**
	 * Constructor for the Recipe class.
	 */
    public Recipe() {
    	this.name = "";
    	this.price = 0;
    	this.amtCoffee = 0;
    	this.amtMilk = 0;
    	this.amtSugar = 0;
    	this.amtChocolate = 0;
    }
    
    /**
	 * Returns the amount of chocolate.
	 *
	 * @return int The amount of chocolate.
	 */
    public int getAmtChocolate() {
		return amtChocolate;
	}

    /**
	 * Sets the amount of chocolate to the recipe if
	 * amtChocolate is greater than or equal to 0
	 *
	 * @param amtChocolate The amount of chocolate to set.
	 */
    /*public void setAmtChocolate(int amtChocolate) {
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} 
	}*/

	//Vitalii Upir s13261
	// rewrite method seAmtChocolate to check type of amtChocolate variable
	public void setAmtChocolate(Object amtChocolate){
		if(amtChocolate!=null){
			if(amtChocolate.getClass()==Integer.class){
				if((int)amtChocolate>=0){
					this.amtChocolate = (int)amtChocolate;
				}else this.amtChocolate = -1;
			}else this.amtChocolate = -1;
		}else this.amtChocolate = -1;
	}

    /**
	 * Returns the amount of coffee.
	 *
	 * @return int The amount of coffee.
	 */
    public int getAmtCoffee() {
		return amtCoffee;
	}

    /**
	 * Sets the amount of coffee to the recipe if amtCoffee
	 * is greater than or equal to 0.
	 *
	 * @param amtCoffee The amount of coffee to set.
	 */
    /*public void setAmtCoffee(int amtCoffee) {
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} 
	}*/

	//Vitalii Upir s13261
	// rewrite method setAmtCoffee to check type of amtCoffee variable
	public void setAmtCoffee(Object amtCoffee){
		if(amtCoffee!=null){
			if(amtCoffee.getClass()==Integer.class){
				if((int)amtCoffee>=0){
					this.amtCoffee = (int)amtCoffee;
				}else this.amtCoffee = -1;
			}else this.amtCoffee = -1;
		}else this.amtCoffee = -1;
	}


    /**
	 * Returns the amount of milk.
     *
	 * @return int  Returns the amtMilk.
	 *
	 */
    public int getAmtMilk() {
		return amtMilk;
	}

    /**
	 * Sets the amount of milk to the recipe.
     *
	 * @param amtMilk The amount of amtMilk to set.
	 */
    /*public void setAmtMilk(int amtMilk) {
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} 
	}*/

	//Vitalii Upir s13261
	// rewrite method setAmtMilk to check type of amtMilk variable
	public void setAmtMilk(Object amtMilk){
		if(amtMilk!=null){
			if(amtMilk.getClass()==Integer.class){
				if((int)amtMilk>=0){
					this.amtMilk = (int)amtMilk;
				}else this.amtMilk = -1;
			}else this.amtMilk = -1;
		}else this.amtMilk = -1;
	}

    /**
	 * Returns the amount of sugar.
	 *
	 * @return  int  Returns the amtSugar.
	 */
    public int getAmtSugar() {
		return amtSugar;
	}

    /**
	 * Sets the amount of sugar to the recipe if amtSugar
	 * is greater than or equal to 0.
	 *
	 * @param amtSugar   The amtSugar to set.
	 */
    /*public void setAmtSugar(int amtSugar) {
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} 
	}*/

	//Vitalii Upir s13261
	// rewrite method setAmtSugar to check type of amtSugar variable
	public void setAmtSugar(Object amtSugar){
		if(amtSugar!=null){
			if(amtSugar.getClass()==Integer.class){
				if((int)amtSugar>=0){
					this.amtSugar = (int)amtSugar;
				}else this.amtSugar = -1;
			}else this.amtSugar = -1;
		}else this.amtSugar = -1;
	}

    /**
	 * Returns the name of the recipe.
	 *
	 * @return String  The name of the recipe.
	 *
	 */
    public String getName() {
		return name;
	}

    /**
	 * Sets the name of recipe if name is not equal
     * to NULL(empty field).
	 *
	 * @param name   The name to set.
	 */
    public void setName(String name) {
    	if(name != null) {
    		this.name = name;
    	}
	}

    /**
	 * Returns the price of recipe.
	 *
	 * @return int The price of recipe.
	 */
    public int getPrice() {
		return price;
	}

    /**
	 * Sets the price if price is greater than or equal to 0.
	 *
	 * @param price   The price to set.
	 */
   /* public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} 
	}*/
	//Vitalii Upir s13261
	// rewrite method setPrice to check type of price variable
	public void setPrice(Object price) {
		if(price!=null) {
			if (price.getClass() == Integer.class) {
				if ((int) price >= 0) {
					this.price = (int) price;
				} else this.price = -1;
			} else this.price = -1;
		}else  this.price = -1;
	}

	/**
	 * Returns boolean(true/false) if the name
     * of the current Recipe(this) equals to name of
     * Recipe object r.
     *
	 * @param r  Recipe object
	 * @return boolean
	 */

    public boolean equals(Recipe r) {
        if((this.name).equals(r.getName())) {
            return true;
        }
        return false;
    }

	/**
	 * Returns the name of recipe.
     *
	 * @return String The name of recipe.
	 * */
   /* public String toString() {
    	return name;
    }*/

	/**
	 * Returns the name of recipe.
	 *
	 * @return String The name of recipe.
	 */
	@Override
	public String toString() {
		return "Recipe{" +
				"name='" + name + '\'' +
				", price=" + price +
				", amtCoffee=" + amtCoffee +
				", amtMilk=" + amtMilk +
				", amtSugar=" + amtSugar +
				", amtChocolate=" + amtChocolate +
				'}';
	}

	/**
	 * Returns the recipe for coffee of the given Context.
	 *
	 * @param context The context of application
     *                to create recipe from.
	 * @return Recipe The object Recipe created by the given context.
	 * @throws ContextException
     */
	static public Recipe getRecipe(Context context) throws ContextException {
		Recipe r = new Recipe();
		r.name = (String)context.getValue("name");
		r.price = (int)context.getValue("price");
		r.amtCoffee = (int)context.getValue("amtCoffee");
		r.amtMilk = (int)context.getValue("amtMilk");
		r.amtSugar = (int)context.getValue("amtSugar");
		r.amtChocolate = (int)context.getValue("amtChocolate");
		return r;
	}

	/**
	 * Returns the context of the given recipe.
	 *
	 * @param recipe The recipe to create context from.
	 * @return Context The context created by the given recipe.
	 * @throws ContextException
     */
	static public Context getContext(Recipe recipe) throws ContextException {
		Context cxt = new ServiceContext();
		cxt.putValue("name", recipe.getName());
		cxt.putValue("price", recipe.getPrice());
		cxt.putValue("amtCoffee", recipe.getAmtCoffee());
		cxt.putValue("amtMilk", recipe.getAmtMilk());
		cxt.putValue("amtSugar", recipe.getAmtSugar());
		cxt.putValue("amtChocolate", recipe.getAmtChocolate());
		return cxt;
	}


}
