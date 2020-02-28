package com.team6941.shuffleboard;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import com.team6941.shuffleboard.data.type.PointType;
import com.team6941.shuffleboard.widget.SimplePointWidget;

import java.util.List;
import java.util.Map;

/**
 * A user plugin that provides a custom data type (a 2D point) and a simple widget for viewing such data.
 */
@Description(
    group = "com.team6941",
    name = "SimplePointWidget",
    version = "2019.1.1",
    summary = "A user plugin that provides a simple data type and a widget for viewing it"
)
public final class SimplePointWidgetPlugin extends Plugin {

  @Override
  public List<DataType> getDataTypes() {
    return List.of(
        PointType.Instance
    );
  }

  @Override
  public List<ComponentType> getComponents() {
    return List.of(
        WidgetType.forAnnotatedWidget(SimplePointWidget.class)
    );
  }

  @Override
  public Map<DataType, ComponentType> getDefaultComponents() {
    return Map.of(
        PointType.Instance, WidgetType.forAnnotatedWidget(SimplePointWidget.class)
    );
  }
}
