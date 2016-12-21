package org.eclipse.e4.ui.tests;

/**
 * All E4 UI-related tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		// Hack: bug 422676, run InjectionEventTest first
		InjectionEventTest.class, #<1>
		StartupTestSuite.class,
		UIEventTypesTest.class,
		Bug299755Test.class,
		Bug308220Test.class,
		Bug320857Test.class,
		PartOnTopManagerTest.class,
		PartRenderingEngineTests.class,
		SashRendererTest.class,
		MApplicationCommandAccessTest.class,
		MMenuItemTest.class,
		MPartTest.class,
		MPartSashContainerTest.class,
		MSaveablePartTest.class,
		MToolItemTest.class,
		MWindowTest.class,
		MSashTest.class,
		HandlerTest.class,
		ContextTest.class,
		Bug308317Test.class,
		ModelRobustnessTest.class,
		ResourceHandlerTest.class,
		PartFocusTest.class,
		ModelElementTest.class,
		StackRendererTest.class,
		TabStateHandlerTest.class,
		ThemeDefinitionChangedHandlerTest.class,
		TopoSortTests.class,
		ExtensionsSortTests.class,
		HandlerActivationTest.class,
		ModelAssemblerTests.class, 
		ModelAssemblerFragmentOrderingTests.class
		// SWTPartRendererTest.class,
})
public class UIAllTests {
}
