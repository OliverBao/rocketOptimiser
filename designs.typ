#set document(author: "Oliver Bao", date: auto)
#set page(width: 15.8cm, margin: 2cm)
#set text(
  font: "New Computer Modern",
  size: 10pt
)
#set rect(
  width: 100%,
  height: 100%,
  inset: 4pt,
)

Requirements:
- able to accomodate multiple new parts as they are designed and added (component class)
- run simulations that actually optimise the goal parameters

Inputs:
- CAD files of multiple kinds? specifying dimensions and shapes (more abstractly probably mainly the outer shell, plus more abstractly the weights of other more complicated inner components), probably a factory design pattern in terms of implementation after a feature translation/vectorisation.
- other certain parameters for measurements, rocket, etc.
- 

Functionality:
- apply constraints to the simulated rocket
- an objective function abstracted from the physical and rocketry aspects (can be included via method generator)
- an optimiser, which needs to run fast ideally (weigh different goal parameters differently?)
- visualiser for simulated data

Outputs: 
- a set of parameters for optimised dimensions, weights and so on.
- 

= Meeting Outlines

Week 7 Meeting, should have skeleton repo complete, with I/O functionality plus class relationships and inheritance all figured out.

Input will be some kind of python file, a class for the component which includes attributes for the rocket plus functions that describe some physical property. These will be then uniformly taken into the Object class, which produces instances for rocket components.

But the Object class does not know about what the inputs are at all - not the attributes nor the methods involved - is this best to use the factory for? read Design Patterns!

== Design Ideas

- mainly it's the individual components that might have new additional functionality (methods)? but not completely new variants, so abtract factory doesn't really make sense unless there are different variants of the same component
- however, since components might have different behaviours or some kind of relevant method to calculate values, which may be needed to add on later, it makes sense to add a visitor pattern, so that new  methods can be added to components - but this is across the board, so every component that is a subclass of the abstract component class will need to implement some specific method
- since classes can inherit from multiple interface, it might be worth it to implement both the visitor and the factory (abstract factory?)


