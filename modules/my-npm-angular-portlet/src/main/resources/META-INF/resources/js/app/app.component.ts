import { Component } from '@angular/core';

@Component({
	selector: '#my-npm-angular-portlet-root',
	template: `
		<div>{{caption}}</div>
	`
})
export class AppComponent {
	caption = 'Hello world!';
}