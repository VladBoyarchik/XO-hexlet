package controllers;

import  io.hexlet.xo.model.Field;
import java.awt.*;
import  io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointExceptionAbstract;
import io.hexlet.xo.model.exceptions.PointAlreadyOccupatedException;

public class MoveController {

    public void ApplyFigure(final Field field, final Point point, final Figure figure ) throws InvalidPointExceptionAbstract,
                                                                                                PointAlreadyOccupatedException {

        if (field.getFigure(point) != null) {
            throw new PointAlreadyOccupatedException();
        }

    }
}
