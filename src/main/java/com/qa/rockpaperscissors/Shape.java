package com.qa.rockpaperscissors;

public enum Shape {
	ROCK {
		@Override
		public Result beats(Shape other) {
			if (other == SCISSORS) {
				return Result.WIN;
			} else if (other == PAPER) {
				return Result.LOSE;
			} else {
				return Result.TIE;
			}
		}
	},

	PAPER {
		@Override
		public Result beats(Shape other) {
			if (other == ROCK) {
				return Result.WIN;
			} else if (other == SCISSORS) {
				return Result.LOSE;
			} else {
				return Result.TIE;
			}
		}
	},

	SCISSORS {
		@Override
		public Result beats(Shape other) {
			if (other == PAPER) {
				return Result.WIN;
			} else if (other == ROCK) {
				return Result.LOSE;
			} else {
				return Result.TIE;
			}
		}
	};

	public abstract Result beats(Shape other);
}
