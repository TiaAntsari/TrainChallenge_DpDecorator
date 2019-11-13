package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public class Empty extends Train {

	public Empty(TrainAbs trainAbs) {
		super(trainAbs);
	}

	@Override
	public String getDescription() {
		return trainAbs.getDescription() + trainAbs.getConnector() + "|____|";
	}

	@Override
	public String getConnector() {

		return "::";
	}

}
