import {TestBed} from '@angular/core/testing';
import {RoadService} from "./roadservice";


describe('RoadserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RoadService = TestBed.get(RoadService);
    expect(service).toBeTruthy();
  });
});
