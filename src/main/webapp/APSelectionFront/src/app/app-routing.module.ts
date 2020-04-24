import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TimeToWordsComponent } from './time-to-words/time-to-words.component';
import { CreateEventComponent } from './create-event/create-event.component';
import { GetAllEventsComponent } from './get-all-events/get-all-events.component';
import { MenuPageComponent } from './menu-page/menu-page.component';


const routes: Routes = [
  { path: 'time-to-words', component: TimeToWordsComponent },
  { path: 'create-event', component: CreateEventComponent },
  { path: 'get-all-events', component: GetAllEventsComponent },
  { path: '', component: MenuPageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
