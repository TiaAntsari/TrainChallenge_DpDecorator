package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public class Head extends Train {

	public Head(TrainAbs trainAbs) {
		super(trainAbs);
	}

	@Override
	public String getDescription() {
		return trainAbs.getDescription() + trainAbs.getConnector() + "HHHH>";
	}

	@Override
	public String getConnector() {

		return "::";
	}

}
