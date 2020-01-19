package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.InvalidPointExceptionAbstract;
import io.hexlet.xo.model.exceptions.PointAlreadyOccupatedException;

import java.awt.*;

public class Field {

    private static final int  FIELD_SIZE = 3;
    private static final int  MIN_COORDINATE = 0;
    private static final int  MAX_COORDINATE = FIELD_SIZE;
    private  final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointExceptionAbstract {
        if (!checkPoint(point)) {
            throw new InvalidPointExceptionAbstract();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure)  throws InvalidPointExceptionAbstract, PointAlreadyOccupatedException{
        field[point.x][point.y] = figure;
        if (!checkPoint(point)) {
            throw new InvalidPointExceptionAbstract();
        }


                //тест??
    }
    private boolean checkPoint(final Point point){
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;

    }
}
