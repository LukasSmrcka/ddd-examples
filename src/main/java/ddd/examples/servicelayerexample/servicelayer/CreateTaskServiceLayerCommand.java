package ddd.examples.servicelayerexample.servicelayer;

import ddd.examples.servicelayerexample.base.ServiceLayerCommand;

/**
 * Created by Lukas on 10.6.2016.
 */
public class CreateTaskServiceLayerCommand extends ServiceLayerCommand {
    public CreateTaskServiceLayerCommand(long clientId, String whatToDo) {
    }
}