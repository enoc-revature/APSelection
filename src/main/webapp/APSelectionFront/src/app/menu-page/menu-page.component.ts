import { Component, OnInit } from '@angular/core';
import { MenuPageService } from './menu-page.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-page',
  templateUrl: './menu-page.component.html',
  styleUrls: ['./menu-page.component.css']
})
export class MenuPageComponent implements OnInit {

  constructor(
    private router: Router,
    private mps: MenuPageService
  ) { }

  ngOnInit(): void {
  }

  toTimeToWords(): void {
    this.router.navigateByUrl('/time-to-words');
  }

  toCreateEvent(): void {
    this.router.navigateByUrl('/create-event');
  }

  toGetAllEvents(): void {
    this.router.navigateByUrl('/get-all-events');
  }
}
