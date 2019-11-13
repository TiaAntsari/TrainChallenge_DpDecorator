package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public class Restaurant extends Train {

	public Restaurant(TrainAbs trainAbs) {
		super(trainAbs);
	}

	@Override
	public String getDescription() {
		return trainAbs.getDescription() + trainAbs.getConnector() + "|hThT|";
	}

	@Override
	public String getConnector() {
		return "::";
	}
}
