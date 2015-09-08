package org.ghostwheel.neural;

/**
 * Created by vladyslavprytula on 17/08/15.
 */
public interface BaseNetwork {
    void train(final boolean[] pattern);
    boolean[] present (final boolean[] pattern);
}
