package mc.leaf.core.interfaces;

import mc.leaf.core.events.interfaces.IEventBridge;
import mc.leaf.core.services.completion.SyntaxContainer;

import java.util.List;

public interface ILeafCore {

    /**
     * Create a {@link SyntaxContainer} for the provided {@link List} of {@link String}
     *
     * @param items
     *         The {@link List} to convert.
     *
     * @return A {@link SyntaxContainer}.
     */
    SyntaxContainer createContainer(List<String> items);

    /**
     * Retrieve an implementation instance of {@link IEventBridge}.
     *
     * @return An instance implementing {@link IEventBridge}.
     */
    IEventBridge getEventBridge();

    /**
     * Register a new dynamic option for command completion. If the name provided have already been registered, the list
     * of options will be replaced.
     *
     * @param name
     *         The name of the dynamic option
     * @param options
     */
    void registerDynamicOptions(String name, List<String> options);

}
